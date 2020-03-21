package com.ssq.recyclerviewdemo.group_recycler_view;

import java.util.ArrayList;

/**
 * Depiction:
 * Author: teach
 * Date: 2017/3/20 15:51
 */
public class GroupModel2 {

    /**
     * 获取组列表数据
     *
     * @param groupCount    组数量
     * @param childrenCount 每个组里的子项数量
     * @return
     */
    public static ArrayList<GroupEntity> getGroups(int groupCount, int childrenCount) {
        ArrayList<GroupEntity> groups = new ArrayList<>();
        for (int i = 0; i < groupCount; i++) {
            ArrayList<ChildEntity> children = new ArrayList<>();
            for (int j = 0; j < childrenCount; j++) {
                children.add(new ChildEntity("第" + (i + 1) + "组第" + (j + 1) + "项"));
            }
            groups.add(new GroupEntity("第" + (i + 1) + "组头部",
                    "第" + (i + 1) + "组尾部", children));
        }
        return groups;
    }

    /**
     * 获取可展开收起的组列表数据(默认展开)
     *
     * @param groupCount    组数量
     * @param childrenCount 每个组里的子项数量
     * @return
     */
    public static ArrayList<ExpandableGroupEntity> getExpandableGroups(int groupCount, int childrenCount, int groupPosition) {
        ArrayList<ExpandableGroupEntity> groups = new ArrayList<>();
        for (int i = 0; i < groupCount; i++) {
            ArrayList<ChildEntity> children = new ArrayList<>();
            for (int j = 0; j < childrenCount; j++) {
                children.add(new ChildEntity("第" + (groupPosition + 1) + "组第" + (j + 1) + "项"));
            }
            if (i == 0) {
                groups.add(new ExpandableGroupEntity("第" + (groupPosition + 1) + "组头部",
                        "第" + (groupPosition + 1) + "组尾部", true, children));
            } else {
                groups.add(new ExpandableGroupEntity("第" + (groupPosition + 1) + "组头部",
                        "第" + (groupPosition + 1) + "组尾部", false, children));
            }
        }
        return groups;
    }

}
