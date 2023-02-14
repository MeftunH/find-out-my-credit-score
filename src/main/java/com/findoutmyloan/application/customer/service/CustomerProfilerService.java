package com.findoutmyloan.application.customer.service;
/* @author - Maftun Hashimli (maftunhashimli@gmail.com)) */

import com.findoutmyloan.application.customer.enums.CustomerProfiler;

public interface CustomerProfilerService {
    CustomerProfiler getCustomerProfile(int creditScore, float monthlyIncome);
}
