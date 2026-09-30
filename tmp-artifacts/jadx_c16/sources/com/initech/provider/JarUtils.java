package com.initech.provider;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.jar.Attributes;
import java.util.jar.JarException;
import java.util.logging.Logger;

/* loaded from: /tmp/toss_alldex/classes16.dex */
public abstract class JarUtils {
    private static final String DEFAULT_MF_VERSION = "1.0";
    private static final String DEFAULT_SF_VERSION = "1.0";
    public static final String DSA_SUFFIX = ".DSA";
    public static final String MANIFEST_VERSION = "Manifest-Version";
    public static final String META_INF = "META-INF/";
    public static final String NAME = "Name";
    public static final String SF_SUFFIX = ".SF";
    public static final String SIGNATURE_VERSION = "Signature-Version";
    private static final Logger log = Logger.getLogger(JarUtils.class.getName());
    public static final byte[] CRLF = {13, 10};
    private static final Attributes.Name CREATED_BY = new Attributes.Name("Created-By");
    private static final String CREATOR = System.getProperty("java.version") + " (" + System.getProperty("java.vendor") + ")";

    public static void readMFManifest(Attributes attributes, Map map, InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        readMainSection(attributes, bufferedReader);
        readIndividualSections(map, bufferedReader);
    }

    public static void readSFManifest(Attributes attributes, Map map, InputStream inputStream) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        String string = Attributes.Name.SIGNATURE_VERSION.toString();
        try {
            String strExpectHeader = expectHeader(string, bufferedReader);
            attributes.putValue(SIGNATURE_VERSION, strExpectHeader);
            if (!"1.0".equals(strExpectHeader)) {
                log.warning("Unexpected version number: " + strExpectHeader + ". Continue (but may fail later)");
            }
            while (true) {
                read_attributes(attributes, bufferedReader);
                String line = bufferedReader.readLine();
                if (line == null || line.length() <= 0) {
                    return;
                } else {
                    attributes = readSectionName(line, bufferedReader, map);
                }
            }
        } catch (IOException e) {
            throw new JarException("Signature file MUST start with a " + string + ": " + e.getMessage());
        }
    }

    private static void readMainSection(Attributes attributes, BufferedReader bufferedReader) throws IOException {
        read_attributes(attributes, bufferedReader);
        if (attributes.getValue(Attributes.Name.MANIFEST_VERSION) == null) {
            attributes.putValue(MANIFEST_VERSION, "0.0");
        }
    }

    private static void readIndividualSections(Map map, BufferedReader bufferedReader) throws IOException {
        String line = bufferedReader.readLine();
        while (line != null && !line.equals("")) {
            read_attributes(readSectionName(line, bufferedReader, map), bufferedReader);
            line = bufferedReader.readLine();
        }
    }

    private static void readVersionInfo(Attributes attributes, BufferedReader bufferedReader) throws IOException {
        String string = Attributes.Name.MANIFEST_VERSION.toString();
        try {
            attributes.putValue(MANIFEST_VERSION, expectHeader(string, bufferedReader));
        } catch (IOException e) {
            throw new JarException("Manifest should start with a " + string + ": " + e.getMessage());
        }
    }

    private static String expectHeader(String str, BufferedReader bufferedReader) throws IOException {
        String line = bufferedReader.readLine();
        if (line == null) {
            throw new JarException("unexpected end of file");
        }
        return expectHeader(str, bufferedReader, line);
    }

    private static void read_attributes(Attributes attributes, BufferedReader bufferedReader) throws IOException {
        String line = bufferedReader.readLine();
        while (line != null && !line.equals("")) {
            readAttribute(attributes, line, bufferedReader);
            line = bufferedReader.readLine();
        }
    }

    private static void readAttribute(Attributes attributes, String str, BufferedReader bufferedReader) throws IOException {
        try {
            int iIndexOf = str.indexOf(": ");
            attributes.putValue(str.substring(0, iIndexOf), readHeaderValue(str.substring(iIndexOf + 2), bufferedReader));
        } catch (IndexOutOfBoundsException unused) {
            throw new JarException("Manifest contains a bad header: " + str);
        }
    }

    private static String readHeaderValue(String str, BufferedReader bufferedReader) throws IOException {
        boolean z = true;
        while (z) {
            bufferedReader.mark(1);
            if (bufferedReader.read() == 32) {
                str = str + bufferedReader.readLine();
            } else {
                bufferedReader.reset();
                z = false;
            }
        }
        return str;
    }

    private static Attributes readSectionName(String str, BufferedReader bufferedReader, Map map) throws JarException {
        try {
            String strExpectHeader = expectHeader(NAME, bufferedReader, str);
            Attributes attributes = new Attributes();
            map.put(strExpectHeader, attributes);
            return attributes;
        } catch (IOException e) {
            throw new JarException("Section should start with a Name header: " + e.getMessage());
        }
    }

    private static String expectHeader(String str, BufferedReader bufferedReader, String str2) throws IOException {
        try {
            if (str2.substring(0, str.length() + 1).equalsIgnoreCase(str + ":")) {
                return readHeaderValue(str2.substring(str.length() + 2), bufferedReader);
            }
        } catch (IndexOutOfBoundsException unused) {
        }
        throw new JarException("unexpected '" + str2 + "'");
    }

    public static void writeMFManifest(Attributes attributes, Map map, OutputStream outputStream) throws IOException {
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 4096);
        writeVersionInfo(attributes, bufferedOutputStream);
        for (Map.Entry<Object, Object> entry : attributes.entrySet()) {
            if (!Attributes.Name.MANIFEST_VERSION.equals(entry.getKey())) {
                writeAttributeEntry(entry, bufferedOutputStream);
            }
        }
        bufferedOutputStream.write(CRLF);
        for (Map.Entry entry2 : map.entrySet()) {
            writeHeader(NAME, entry2.getKey().toString(), bufferedOutputStream);
            Iterator<Map.Entry<Object, Object>> it = ((Attributes) entry2.getValue()).entrySet().iterator();
            while (it.hasNext()) {
                writeAttributeEntry(it.next(), bufferedOutputStream);
            }
            bufferedOutputStream.write(CRLF);
        }
        bufferedOutputStream.flush();
    }

    public static void writeSFManifest(Attributes attributes, Map map, OutputStream outputStream) throws IOException {
        BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 4096);
        writeHeader(Attributes.Name.SIGNATURE_VERSION.toString(), "1.0", bufferedOutputStream);
        writeHeader(CREATED_BY.toString(), CREATOR, bufferedOutputStream);
        for (Map.Entry<Object, Object> entry : attributes.entrySet()) {
            Attributes.Name name = (Attributes.Name) entry.getKey();
            if (!Attributes.Name.SIGNATURE_VERSION.equals(name) && !CREATED_BY.equals(name)) {
                writeHeader(name.toString(), (String) entry.getValue(), bufferedOutputStream);
            }
        }
        bufferedOutputStream.write(CRLF);
        for (Map.Entry entry2 : map.entrySet()) {
            writeHeader(NAME, entry2.getKey().toString(), bufferedOutputStream);
            for (Map.Entry<Object, Object> entry3 : ((Attributes) entry2.getValue()).entrySet()) {
                writeHeader(entry3.getKey().toString(), (String) entry3.getValue(), bufferedOutputStream);
            }
            bufferedOutputStream.write(CRLF);
        }
        bufferedOutputStream.flush();
    }

    private static void writeVersionInfo(Attributes attributes, OutputStream outputStream) throws IOException {
        Attributes.Name name = Attributes.Name.MANIFEST_VERSION;
        String value = attributes.getValue(name);
        if (value == null) {
            value = "1.0";
        }
        writeHeader(name.toString(), value, outputStream);
    }

    private static void writeAttributeEntry(Map.Entry entry, OutputStream outputStream) throws IOException {
        String string = entry.getKey().toString();
        String string2 = entry.getValue().toString();
        if (string.equalsIgnoreCase(NAME)) {
            throw new JarException("Attributes cannot be called 'Name'");
        }
        if (string.startsWith("From")) {
            throw new JarException("Header cannot start with the four letters 'From'" + string);
        }
        writeHeader(string, string2, outputStream);
    }

    private static void writeHeader(String str, String str2, OutputStream outputStream) throws IOException {
        String str3;
        int i;
        byte[] bytes;
        String str4 = str + ": ";
        byte[] bytes2 = str4.getBytes("UTF-8");
        if (bytes2.length > 72) {
            throw new IOException("Attribute's name already longer than 70 bytes");
        }
        if (bytes2.length == 72) {
            outputStream.write(bytes2);
            outputStream.write(CRLF);
            str3 = " " + str2;
        } else {
            str3 = str4 + str2;
        }
        while (true) {
            byte[] bytes3 = str3.getBytes("UTF-8");
            if (bytes3.length < 73) {
                outputStream.write(bytes3);
                outputStream.write(CRLF);
                return;
            }
            i = 72;
            do {
                bytes = str3.substring(0, i).getBytes("UTF-8");
                if (bytes.length < 73) {
                    break;
                } else {
                    i--;
                }
            } while (i > 0);
            throw new IOException("Header is unbreakable and longer than 72 bytes");
            outputStream.write(bytes);
            outputStream.write(CRLF);
            str3 = " " + str3.substring(i);
        }
    }
}
