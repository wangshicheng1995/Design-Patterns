package com.wangshicheng.Structural.Facade;

import com.wangshicheng.Structural.Facade.Organize.AdminOfIndustry;
import com.wangshicheng.Structural.Facade.Organize.Bank;
import com.wangshicheng.Structural.Facade.Organize.Taxation;

public class Facade {

    private AdminOfIndustry admin = new AdminOfIndustry();
    private Bank bank = new Bank();
    private Taxation taxation = new Taxation();

    public Company openCompany(String name) {
        Company c = this.admin.register(name);
        String bankAccount = this.bank.openAccount(c.getId());
        String taxCode = this.taxation.applyTaxCode(bankAccount);
        c.setTaxCode(taxCode);
        return c;
    }

}
