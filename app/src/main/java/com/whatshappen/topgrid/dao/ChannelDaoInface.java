package com.whatshappen.topgrid.dao;

import java.util.List;
import java.util.Map;

import com.whatshappen.topgrid.bean.ChannelItem;

import android.content.ContentValues;

public interface ChannelDaoInface {
	public boolean addCache(ChannelItem item);

	public boolean deleteCache(String whereClause, String[] whereArgs);

	public boolean updateCache(ContentValues values, String whereClause,
			String[] whereArgs);

	public Map<String, String> viewCache(String selection,
			String[] selectionArgs);

	public List<Map<String, String>> listCache(String selection,
			String[] selectionArgs);

	public void clearFeedTable();
}
