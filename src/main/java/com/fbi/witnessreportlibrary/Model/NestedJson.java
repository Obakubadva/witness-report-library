package com.fbi.witnessreportlibrary.Model;

import java.util.List;

public class NestedJson {
    private int total;
    private List<CaseModel> items;
    private int page;

    public NestedJson() {
    }

    public NestedJson(int total, List<CaseModel> items, int page) {
        this.total = total;
        this.items = items;
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<CaseModel> getItems() {
        return items;
    }

    public void setItems(List<CaseModel> items) {
        this.items = items;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
