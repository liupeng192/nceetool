package cn.bj.xdf.framework.rmidata;

import java.util.TreeMap;

/**
 * @author liupeng
 * @date 2020/12/9
 **/
public class BaseDictionary<T1, T2>
        extends TreeMap<T1, T2>
{
    private static final long serialVersionUID = -8620966110597905887L;

    public int Count()
    {
        return size();
    }

    public void Add(T1 key, T2 value)
    {
        put(key, value);
    }
}

