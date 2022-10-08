package io.github.ranlee1.jpinyin;

import io.github.ranlee1.jpinyin.PinyinResource;
import org.junit.Assert;
import org.junit.Test;

public class TestPinyinResource {

    @Test
    public void testPinyinResource() {
        Assert.assertTrue(PinyinResource.getChineseResource().size() > 0);
        Assert.assertTrue(PinyinResource.getMutilPinyinResource().size() > 0);
        Assert.assertTrue(PinyinResource.getPinyinResource().size() > 0);
    }
}
