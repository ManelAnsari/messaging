package im.actor.core.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import java.io.IOException;

public enum ApiAuthHolder {

    THISDEVICE(1),
    OTHERDEVICE(2),
    UNSUPPORTED_VALUE(-1);

    private int value;

    ApiAuthHolder(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ApiAuthHolder parse(int value) throws IOException {
        switch(value) {
            case 1: return ApiAuthHolder.THISDEVICE;
            case 2: return ApiAuthHolder.OTHERDEVICE;
            default: return ApiAuthHolder.UNSUPPORTED_VALUE;
        }
    }
}
