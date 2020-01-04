package com.github.vlmap.spring.loadbalancer.core.platform;

public class Platform {
    public static final String SERVLET = "servlet";
    public static final String REACTIVE = "reactive";
    private static final Platform instnce = new Platform();
    private String platform;
    private boolean isServlet;
    private boolean isReactive;
    private boolean isHystrix;


    /**
     * 当前是否就网关服务
     */
    private boolean isGatewayService = false;

    public static Platform getInstnce() {
        return instnce;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
        isServlet = SERVLET.equals(platform);
        isReactive = REACTIVE.equals(platform);
    }

    public boolean isHystrix() {
        return isHystrix;
    }

    public void setHystrix(boolean hystrix) {
        isHystrix = hystrix;
    }

    public boolean isGatewayService() {
        return isGatewayService;
    }

    public void setGatewayService(boolean gatewayService) {
        isGatewayService = gatewayService;
    }


    public boolean isServlet() {
        return isServlet;
    }

    public boolean isReactive() {
        return isReactive;
    }
}
