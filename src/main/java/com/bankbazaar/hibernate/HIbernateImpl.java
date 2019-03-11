package com.bankbazaar.hibernate;

import com.bankbazaar.dao.ApplicationMetaDataDao;
import com.bankbazaar.model.ApplicationMetaData;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import com.bankbazaar.model.Bank;
import java.util.Date;

/**
 * Created by abhi on 7/3/19.
 */
public class HIbernateImpl {
    public static void main(String[] args) {
        System.out.println("abhishek");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationMetaDataDao applicationMetaDataDao = context.getBean(ApplicationMetaDataDao.class);
        ApplicationMetaData applicationMetaData = new ApplicationMetaData();
        Long id= Long.valueOf(876565651);

        applicationMetaData.setApplicationId(id);
        applicationMetaData.setCreatedOn(new Date(System.currentTimeMillis()));
        applicationMetaData.setLastUpdatedOn(new Date(System.currentTimeMillis()));
        applicationMetaData.setPolicyStartDate(new Date(System.currentTimeMillis()));
        applicationMetaData.setPolicyStartDate(new Date(System.currentTimeMillis() + 100000));
        applicationMetaDataDao.save(applicationMetaData);
        context.close();

    }
}

