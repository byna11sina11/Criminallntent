package com.youare.criminallntent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by st on 2017-11-21.
 */
public class Crime {
    private UUID uuid;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Date getmDate() {
        return mDate;
    }

    public void setmDate(Date mDate) {
        this.mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public Crime(){
        uuid=UUID.randomUUID();
        mDate=new Date();

    }

    public UUID getUuid() {
        return uuid;
    }


    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
