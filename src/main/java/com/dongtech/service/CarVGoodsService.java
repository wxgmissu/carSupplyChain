package com.dongtech.service;

import com.dongtech.vo.*;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
@Service
public interface CarVGoodsService {

    List<Cargoods> queryList(Cargoods carGoods) throws SQLException;



    List<CarOrders> queryOrders();

    List<CarOrdersDetails> queryOrdersDetails(Integer id);


}
