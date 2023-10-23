package com.cg.domain.dto.orderDetail;

import com.cg.domain.dto.tableOrder.TableOrderResDTO;
import com.cg.domain.enums.EOrderDetailStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class OrderDetailChangeResDTO {
    private TableOrderResDTO table;
    private BigDecimal totalAmount;
    private EOrderDetailStatus status;
    private List<OrderDetailChangeStatusResDTO> products;
}
