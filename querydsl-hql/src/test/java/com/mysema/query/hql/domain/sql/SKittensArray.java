package com.mysema.query.hql.domain.sql;

import com.mysema.query.types.path.*;
import static com.mysema.query.types.path.PathMetadataFactory.*;
import com.mysema.query.types.expr.*;
import com.mysema.query.types.custom.*;

/**
 * SKittensArray is a Querydsl query type for SKittensArray
 */
@SuppressWarnings("serial")
@com.mysema.query.sql.Table(value="KITTENS_ARRAY")
public class SKittensArray extends PEntity<SKittensArray> {

    public final PNumber<Integer> animalId = createNumber("ANIMAL_ID", Integer.class);

    public final PNumber<Integer> arrayindex = createNumber("ARRAYINDEX", Integer.class);

    public final PNumber<Integer> kittensarrayId = createNumber("KITTENSARRAY_ID", Integer.class);

    public SKittensArray(String variable) {
        super(SKittensArray.class, forVariable(variable));
    }

    public SKittensArray(PEntity<? extends SKittensArray> entity) {
        super(entity.getType(),entity.getMetadata());
    }

    public SKittensArray(PathMetadata<?> metadata) {
        super(SKittensArray.class, metadata);
    }

    public Expr<Object[]> all() {
        return CSimple.create(Object[].class, "{0}.*", this);
    }

}

