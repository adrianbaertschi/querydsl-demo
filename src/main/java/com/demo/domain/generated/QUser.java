package com.demo.domain.generated;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QUser is a Querydsl query type for QUser
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUser extends com.querydsl.sql.RelationalPathBase<QUser> {

    private static final long serialVersionUID = 1842507505;

    public static final QUser user = new QUser("USER");

    public final StringPath firstname = createString("firstname");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath lastname = createString("lastname");

    public final com.querydsl.sql.PrimaryKey<QUser> constraint2 = createPrimaryKey(id);

    public QUser(String variable) {
        super(QUser.class, forVariable(variable), "PUBLIC", "USER");
        addMetadata();
    }

    public QUser(String variable, String schema, String table) {
        super(QUser.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUser(String variable, String schema) {
        super(QUser.class, forVariable(variable), schema, "USER");
        addMetadata();
    }

    public QUser(Path<? extends QUser> path) {
        super(path.getType(), path.getMetadata(), "PUBLIC", "USER");
        addMetadata();
    }

    public QUser(PathMetadata metadata) {
        super(QUser.class, metadata, "PUBLIC", "USER");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(firstname, ColumnMetadata.named("FIRSTNAME").withIndex(2).ofType(Types.VARCHAR).withSize(50).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(lastname, ColumnMetadata.named("LASTNAME").withIndex(3).ofType(Types.VARCHAR).withSize(50).notNull());
    }

}

