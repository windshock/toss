package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public final class StructuralMessageInfo$Builder {
    private int[] checkInitialized;
    private Object defaultInstance;
    private final List<FieldInfo> fields;
    private boolean messageSetWireFormat;
    private ProtoSyntax syntax;
    private boolean wasBuilt;

    public StructuralMessageInfo$Builder() {
        this.checkInitialized = null;
        this.fields = new ArrayList();
    }

    public StructuralMessageInfo$Builder(int i) {
        this.checkInitialized = null;
        this.fields = new ArrayList(i);
    }

    public void withDefaultInstance(Object obj) {
        this.defaultInstance = obj;
    }

    public void withSyntax(ProtoSyntax protoSyntax) {
        this.syntax = (ProtoSyntax) Internal.checkNotNull(protoSyntax, "syntax");
    }

    public void withMessageSetWireFormat(boolean z) {
        this.messageSetWireFormat = z;
    }

    public void withCheckInitialized(int[] iArr) {
        this.checkInitialized = iArr;
    }

    public void withField(FieldInfo fieldInfo) {
        if (this.wasBuilt) {
            throw new IllegalStateException("Builder can only build once");
        }
        this.fields.add(fieldInfo);
    }

    public StructuralMessageInfo build() {
        if (this.wasBuilt) {
            throw new IllegalStateException("Builder can only build once");
        }
        if (this.syntax == null) {
            throw new IllegalStateException("Must specify a proto syntax");
        }
        this.wasBuilt = true;
        Collections.sort(this.fields);
        return new StructuralMessageInfo(this.syntax, this.messageSetWireFormat, this.checkInitialized, (FieldInfo[]) this.fields.toArray(new FieldInfo[0]), this.defaultInstance);
    }
}
