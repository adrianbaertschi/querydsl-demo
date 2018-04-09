import com.demo.domain.generated.QUser;
import com.querydsl.sql.Configuration;
import com.querydsl.sql.H2Templates;
import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.SQLTemplates;
import org.h2.jdbcx.JdbcDataSource;

public class QueryDslDemo {

    public static void main(String[] args) {

        SQLTemplates templates = new H2Templates();
        Configuration configuration = new Configuration(templates);

        JdbcDataSource dataSource = new JdbcDataSource();
        dataSource.setURL("jdbc:h2:~/test");
        SQLQueryFactory queryFactory = new SQLQueryFactory(configuration, dataSource);


//        queryFactory.insert(user)
//                .columns(user.firstname, user.lastname)
//                .values("Adrian", "Bärtschi")
//                .execute();

        QUser user = QUser.user;
        queryFactory.select(user.firstname)
                .from(user)
                .where(user.firstname.startsWith("A"))
                .fetch()
                .forEach(System.out::println);
    }
}
