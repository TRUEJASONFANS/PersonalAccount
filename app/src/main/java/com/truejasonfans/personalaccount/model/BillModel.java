package com.truejasonfans.personalaccount.model;

import android.text.format.Time;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by jason on 2015/8/9.
 */
@Table(name = "bills")
public class BillModel extends Model {

    @Column(name = "billId")
    private int billId;

    @Column(name = "billCost")
    private double billCost;

    @Column(name = "billDate")
    private Time billDate;


}
