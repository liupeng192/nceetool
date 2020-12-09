package cn.bj.xdf.framework.assist;

/**
 * @author liupeng
 * @date 2020/12/8-15:19
 **/
public class ViewInfo {
    public boolean success = true;
    public boolean veritySuccess=true;
    public String errorMsg = "";
    public String targetUri = "";
    public ViewInfo setSuccess(boolean success)
    {
        this.success = success;
        return this;
    }
}
