package com.bushneo.behavioral.l_chainofResponsibility.demo2;

// BaseAuthenticationStrategy 是策略模式实现，定义了 mark、execute 方法
public class NameIdCardAuthenticationByTencentResolver extends AbstractAuthenticationService<NameIdCardAuthenticationReqDTO>
        implements BaseAuthenticationStrategy<NameIdCardAuthenticationReqDTO> {

    private static final String SUCCESS = "0";

  	// 责任链容器 (可通过容器注入)
    private NameIdCardHandlerChain nameIdCardHandlerChain;

    public NameIdCardAuthenticationByTencentResolver(NameIdCardHandlerChain nameIdCardHandlerChain) {
        this.nameIdCardHandlerChain = nameIdCardHandlerChain;
    }

    @Override
    public String mark() {
        return AuthenticationEnum.TENCENT.name();
    }

    @Override
    public void execute(NameIdCardAuthenticationReqDTO request) {
        authentication(request);
    }

    @Override
    public void before(NameIdCardAuthenticationReqDTO request) {
      	// 责任链调用
        nameIdCardHandlerChain.doFilter(request);
    }

    @Override
    public void practicalExecute(NameIdCardAuthenticationReqDTO request) {
        // 腾讯云二要素认证具体行为
    }

}