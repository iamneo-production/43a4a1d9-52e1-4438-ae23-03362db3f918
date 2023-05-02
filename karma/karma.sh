#!/bin/bash

if [ -d "/home/coder/project/workspace/angularapp" ]
then
    echo "project folder present"
    cp /home/coder/project/workspace/karma/karma.conf.js /home/coder/project/workspace/angularapp/karma.conf.js;

    # checking for login component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/auth/login" ]
    then
        cp /home/coder/project/workspace/karma/login.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/auth/login/login.component.spec.ts;
    else
        echo "FE_login FAILED";
    fi

    # checking for signup component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/auth/signup" ]
    then
        cp /home/coder/project/workspace/karma/signup.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/auth/signup/signup.component.spec.ts;
    else
        echo "FE_signup FAILED";
    fi

    # checking for addproducts component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/admin/addproducts" ]
    then
        cp /home/coder/project/workspace/karma/addproducts.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/admin/addproducts/addproducts.component.spec.ts;
    else
        echo "FE_AdminAddproductsTest FAILED";
    fi

    # checking for adminhomepage component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/admin/adminhomepage" ]
    then
        cp /home/coder/project/workspace/karma/adminhomepage.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/admin/adminhomepage/adminhomepage.component.spec.ts;
    else
        echo "FE_AdminhomepageTest FAILED";
    fi

    # checking for adminorder component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/admin/adminorder" ]
    then
        cp /home/coder/project/workspace/karma/adminorder.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/admin/adminorder/adminorder.component.spec.ts;
    else
        echo "FE_AdminorderTest FAILED";
    fi


    # checking for customercart component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/customer/customercart" ]
    then
        cp /home/coder/project/workspace/karma/customercart.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/customer/customercart/customercart.component.spec.ts;
    else
        echo "FE_CustomercartTest FAILED";
    fi

    # checking for customerhomepage component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/customer/customerhomepage" ]
    then
        cp /home/coder/project/workspace/karma/customerhomepage.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/customer/customerhomepage/customerhomepage.component.spec.ts;
    else
        echo "FE_CustomerhomepageTest FAILED";
    fi

    # checking for customerorder component
    if [ -d "/home/coder/project/workspace/angularapp/src/app/components/customer/customerorder" ]
    then
        cp /home/coder/project/workspace/karma/customerorder.component.spec.ts /home/coder/project/workspace/angularapp/src/app/components/customer/customerorder/customerorder.component.spec.ts;
    else
        echo "FE_CustomerorderTest FAILED";
    fi

    cd /home/coder/project/workspace/angularapp/;
    npm test;
else   
    echo "FE_login FAILED";
    echo "FE_signup FAILED";
    echo "FE_AdminAddproductsTest FAILED";
    echo "FE_AdminhomepageTest FAILED";
    echo "FE_AdminorderTest FAILED";
    echo "FE_CustomercartTest FAILED";
    echo "FE_CustomerhomepageTest FAILED";
    echo "FE_CustomerorderTest FAILED";
fi