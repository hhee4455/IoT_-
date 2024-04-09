package inhatc.cse.spring.di.xml_profiles;

public class ServerInfo {
    private String ipNum;
    private String portNum;;

    public void setIpNum(String ipNum) {
        this.ipNum = ipNum;
    }

    public void setPortNum(String portNum) {
        this.portNum = portNum;
    }

    public String getIpNum() {
        return ipNum;
    }

    public String getPortNum() {
        return portNum;
    }

    public String toString() {
        return "ServerInfo [ipNum=" + ipNum + ", portNum=" + portNum + "]";
    }
}
