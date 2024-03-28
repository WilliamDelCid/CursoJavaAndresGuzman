package org.william.poointerfaces.repositorio;

public interface OrdenablePaginableCrudRepositorio extends
OrdenableRepository,
        PaginableRepositorio,
            CrudRepository,
        ContableRepository
{
}
