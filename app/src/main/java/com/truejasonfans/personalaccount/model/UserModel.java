package com.truejasonfans.personalaccount.model;

import android.text.format.Time;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by jason on 2015/8/9.
 */
@Table(name = "Users")
public class UserModel extends Model{

    @Column(name = "userId")
    private int userId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "registedTime")
    private Time regitsedTime;

    @Column(name = "propertyamount")
    private double propertyamount;

}
