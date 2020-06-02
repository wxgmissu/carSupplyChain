package com.dongtech.service.impl;


import com.dongtech.dao.CarGoodsDao;
import com.dongtech.dao.impl.CarGoodsDaoImpl;
import com.dongtech.service.CarVGoodsService;
import com.dongtech.vo.*;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class CarGoodsServiceImpl implements CarVGoodsService {

    CarGoodsDao dao = new CarGoodsDaoImpl();


    @Override
    public List<Cargoods> queryList(Cargoods carGoods) throws SQLException {
        return dao.queryList(carGoods);
    }

    @Override
    public List<CarOrders> queryOrders() {
        return dao.queryOrders();
    }

    @Override
    public List<CarOrdersDetails> queryOrdersDetails(Integer id) {
        return dao.queryOrdersDetails(id);
    }



}
