package im.actor.core.api.rpc;
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

public class ResponseGetOAuth2Params extends Response {

    public static final int HEADER = 0xc3;
    public static ResponseGetOAuth2Params fromBytes(byte[] data) throws IOException {
        return Bser.parse(new ResponseGetOAuth2Params(), data);
    }

    private String authUrl;

    public ResponseGetOAuth2Params(@NotNull String authUrl) {
        this.authUrl = authUrl;
    }

    public ResponseGetOAuth2Params() {

    }

    @NotNull
    public String getAuthUrl() {
        return this.authUrl;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.authUrl = values.getString(1);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        if (this.authUrl == null) {
            throw new IOException();
        }
        writer.writeString(1, this.authUrl);
    }

    @Override
    public String toString() {
        String res = "tuple GetOAuth2Params{";
        res += "}";
        return res;
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}
