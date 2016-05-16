package com.example.paul.retrofitsource;

import java.util.List;

/**
 * Created by paul on 16/5/16.
 */
public class TgouResponse {
    private boolean status;
    private int total;
    private List<Tgou> tngou;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Tgou> getTngou() {
        return tngou;
    }

    public void setTngou(List<Tgou> tngou) {
        this.tngou = tngou;
    }
}
