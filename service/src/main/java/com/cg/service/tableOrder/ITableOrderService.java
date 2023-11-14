package com.cg.service.tableOrder;

import com.cg.domain.dto.tableOrder.*;
import com.cg.domain.entity.TableOrder;
import com.cg.domain.entity.Zone;
import com.cg.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ITableOrderService extends IGeneralService<TableOrder, Long> {
    Page<TableOrderDTO> findAllTableOrder(String search, Pageable pageable);

    List<TableOrderDTO> findAllTablesWithoutSenderId(@Param("tableId") Long tableId);


    TableOrderCreateResDTO createTableOrder(TableOrderCreateReqDTO tableOrderCreateReqDTO, Zone zone);

    void changeAllProductToNewTable(Long oldTableId, Long newTableId);

    void combineTable(TableOrder currentTable, TableOrder targetTable);

//    TableOrder unCombineTable(TableOrder currentTable);

    List<TableOrderDTO> findAllTableOrder();

    TableOrderCountDTO countTable ();

    List<TableOrderWithZoneCountDTO> countTableOrderByZone();


}
