package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import database.TableSchema.Column;

public class TableData {

	DbAccess db;

	public TableData(DbAccess db) {
		this.db = db;
	}

	/*
	 * public List<Example> getDistinctTransazioni(String table) throws
	 * SQLException, EmptySetException { // to do
	 * 
	 * }
	 */

	public Set<Object> getDistinctColumnValues(String table, Column column) throws SQLException {
		return null;
		// to do

	}

	/*
	 * public Object getAggregateColumnValue(String table, Column column, QUERY_TYPE
	 * aggregate) throws SQLException, NoValueException { // to do }
	 * 
	 * }
	 */

}
