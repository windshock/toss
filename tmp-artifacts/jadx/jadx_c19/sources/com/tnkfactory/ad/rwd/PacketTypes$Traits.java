package com.tnkfactory.ad.rwd;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class PacketTypes$Traits {
    public String className;
    public boolean isExternal;
    public List<String> propNames;

    public PacketTypes$Traits(String str, boolean z) {
        this.propNames = null;
        this.className = str;
        this.isExternal = z;
        this.propNames = new ArrayList();
    }

    public PacketTypes$Traits() {
        this.className = "";
        this.isExternal = false;
        this.propNames = null;
    }
}
