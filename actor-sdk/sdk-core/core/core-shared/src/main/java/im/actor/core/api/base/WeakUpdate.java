package im.actor.core.api.base;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.runtime.bser.*;
import im.actor.runtime.collections.*;
import static im.actor.runtime.bser.Utils.*;
import im.actor.core.network.parser.*;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.j2objc.annotations.ObjectiveCName;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import im.actor.core.api.*;

public class WeakUpdate extends RpcScope {

    public static final int HEADER = 0x1a;
    public static WeakUpdate fromBytes(byte[] data) throws IOException {
        return Bser.parse(new WeakUpdate(), data);
    }

    private long date;
    private int updateHeader;
    private byte[] update;

    public WeakUpdate(long date, int updateHeader, @NotNull byte[] update) {
        this.date = date;
        this.updateHeader = updateHeader;
        this.update = update;
    }

    public WeakUpdate() {

    }

    public long getDate() {
        return this.date;
    }

    public int getUpdateHeader() {
        return this.updateHeader;
    }

    @NotNull
    public byte[] getUpdate() {
        return this.update;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.date = values.getLong(1);
        this.updateHeader = values.getInt(2);
        this.update = values.getBytes(3);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeLong(1, this.date);
        writer.writeInt(2, this.updateHeader);
        if (this.update == null) {
            throw new IOException();
        }
        writer.writeBytes(3, this.update);
    }

    @Override
    public String toString() {
        String res = "update box WeakUpdate{";
        res += "date=" + this.date;
        res += ", updateHeader=" + this.updateHeader;
        res += ", update=" + byteArrayToStringCompact(this.update);
        res += "}";
        return res;
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}
