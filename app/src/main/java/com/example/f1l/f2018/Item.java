package com.example.f1l.f2018;

/**
 * Created by F1L on 05.02.2017.
 */

public class Item {
    int id;
    String name;
    String subname;
    int image;
    int ic_l;


    Item(int _id, String _describe, String _sub_describe, int _android,int _image) {
        id = _id;
        name = _describe;
        subname = _sub_describe;
        ic_l = _android;
        image = _image;
    }
}
