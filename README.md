# TopGrid
高仿网易新闻新版频道管理功能

## 描述
该项目是仿网易新闻客户端的频道管理功能，实现ITEM的拖拽，添加和删除操作。

## 使用  
可拖拽的GridView：  
    <pre><code>
<com.whatshappen.topgrid.view.DragGrid<\br>
                android:id="@+id/userGridView"
                android:layout_width="fill_parent"
                android:layout_height="wrap_content"
                android:layout_marginLeft="10dip"
                android:layout_marginRight="10dip"
                android:gravity="center"
                android:horizontalSpacing="6dip"
                android:listSelector="@android:color/transparent"
                android:numColumns="4"
                android:scrollbars="vertical"
                android:stretchMode="columnWidth"
                android:verticalSpacing="14.0px" />

</code></pre>
不可拖拽的GridView：  
	<pre><code>
	<com.whatshappen.topgrid.view.OtherGridView
                    android:id="@+id/otherGridView"
                    android:layout_width="fill_parent"
                    android:layout_height="wrap_content"
                    android:layout_marginLeft="10dip"
                    android:layout_marginRight="10dip"
                    android:gravity="center"
                    android:horizontalSpacing="6dip"
                    android:listSelector="@android:color/transparent"
                    android:numColumns="4"
                    android:scrollbars="vertical"
                    android:stretchMode="columnWidth"
                    android:verticalSpacing="14.0px" />

</code></pre>

## 实现效果
![](https://github.com/whatshappen/TopGrid/blob/master/screenshots/demo.gif)  

在此要感谢[vipra](http://blog.csdn.net/vipzjyno1/article/details/25005851](http://blog.csdn.net/vipzjyno1/article/details/25005851)，此项目是在这个项目基础上修改的。
## License
Licensed under the [Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)
