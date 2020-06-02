package com.dongtech.dao;


import com.dongtech.vo.*;

import java.util.List;

public interface CarGoodsDao {
    List<Cargoods> queryList(Cargoods carGoods) ;

    List<CarOrders> queryOrders();

    List<CarOrdersDetails> queryOrdersDetails(Integer id);

}
