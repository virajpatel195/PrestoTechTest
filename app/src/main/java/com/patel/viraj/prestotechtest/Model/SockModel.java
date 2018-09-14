package com.patel.viraj.prestotechtest.Model;

import android.support.annotation.NonNull;
import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SockModel {
    @NonNull
    private String sockId;
    @NonNull
    private String sockColor;
    @NonNull
    private String sockType;

    public SockModel(){

    }
    public SockModel(String sockId, String sockColor, String sockType) {
        this.sockId = sockId;
        this.sockColor = sockColor;
        this.sockType = sockType;
    }

    public String getSockId() {
        return sockId;
    }

    public void setSockId(String sockId) {
        this.sockId = sockId;
    }

    public String getSockColor() {
        return sockColor;
    }

    public void setSockColor(String sockColor) {
        this.sockColor = sockColor;
    }

    public String getSockType() {
        return sockType;
    }

    public void setSockType(String sockType) {
        this.sockType = sockType;
    }

    public static ArrayList sockParser(String socksData) {
        ArrayList<SockModel> socksList = new ArrayList<>();
        if (socksData != null) {
            String[] socksArray = socksData.split(",");
            for (int i = 0; i < socksArray.length; i++) {
                socksArray[i].replace(",", "");
                String[] sock = socksArray[i].split("/");
                if (sock.length == 3) {
                    socksList.add(new SockModel(sock[0].replace("/", ""), sock[1].replace("/", ""), sock[2].replace("/", "")));
                }
            }
        }
        return socksList;
    }

    public static String sockSeparator(ArrayList<SockModel> socksList) {
        String result = "";
        for (int i = 0; i < socksList.size(); i++) {
            for (int j = 0; j < socksList.size(); j++) {
                if (socksList.get(i).getSockColor().equalsIgnoreCase(socksList.get(j).getSockColor())) {
                    if (!socksList.get(i).getSockType().equalsIgnoreCase(socksList.get(j).getSockType())) {
                        if (i > j) {
                            result = result + socksList.get(j).getSockId() + " " + socksList.get(i).getSockId() + "\n";
                        } else {
                            result = result + socksList.get(i).getSockId() + " " + socksList.get(j).getSockId() + "\n";
                        }
                        socksList.remove(i);
                        socksList.remove(j);
                        break;
                    }
                }
            }
        }
        return result;
    }

    public static String oppositeSockSeparator(ArrayList<SockModel> socksList) {
        String result = "";
        for (int i = 0; i < socksList.size(); i++) {
            for (int j = 0; j < socksList.size(); j++) {
                if (socksList.get(i).getSockColor().equalsIgnoreCase(socksList.get(j).getSockColor())) {
                    break;
                } else {
                    if (socksList.get(i).getSockType().equalsIgnoreCase("left") && socksList.get(j).getSockType().equalsIgnoreCase("left")) {
                        result = result + socksList.get(i).getSockId() + "\n" + socksList.get(j).getSockId() + "\n";
                    } else {
                        result = result + socksList.get(i).getSockId() + " " + socksList.get(j).getSockId() + "\n";
                    }
                    socksList.remove(i);
                    socksList.remove(j);
                    i = i - 2;
                    break;
                }
            }
        }
        return result;
    }
}
