package org.william.poointerfaces.repositorio;

public interface OrdenablePaginableCrudRepositorio<T> extends
        OrdenableRepository<T>,
        PaginableRepositorio<T>,
        CrudRepository<T>,
        ContableRepository {
}
