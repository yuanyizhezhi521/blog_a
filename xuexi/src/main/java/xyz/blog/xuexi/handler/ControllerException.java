package xyz.blog.xuexi.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @ControllerAdvice
 * 拦截所有Controller
 */
@ControllerAdvice
public class ControllerException {
    /*

     */
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     *
     * @param request 获取异常的url
     * @param e 获取异常的类型大致确定问题所在
     * @return 返回数据加页面
     * @throws Exception 抛出异常
     * ExceptionHandler 表示此方法可用于处理异常 所需参数为Exception
     */
    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHander(HttpServletRequest request, Exception e) throws Exception {
        /**
         * request.getRequestURL() 获取url
         */
        logger.error("Requst URL : {}，Exception : {}", request.getRequestURL(),e);

        if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
            throw e;
        }

        ModelAndView mv = new ModelAndView();
        mv.addObject("url",request.getRequestURL());
        mv.addObject("exception", e);
        mv.setViewName("error/error");
        return mv;
    }
}
