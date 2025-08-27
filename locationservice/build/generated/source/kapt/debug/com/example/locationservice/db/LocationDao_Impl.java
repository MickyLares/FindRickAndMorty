package com.example.locationservice.db;

import androidx.annotation.NonNull;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import com.example.locationservice.data.model.Location;
import com.example.locationservice.utils.StringListConverter;
import java.lang.Class;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class LocationDao_Impl implements LocationDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<Location> __insertAdapterOfLocation;

  private final StringListConverter __stringListConverter = new StringListConverter();

  public LocationDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfLocation = new EntityInsertAdapter<Location>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `locations` (`created`,`dimension`,`id`,`name`,`residents`,`type`,`url`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final Location entity) {
        if (entity.getCreated() == null) {
          statement.bindNull(1);
        } else {
          statement.bindText(1, entity.getCreated());
        }
        if (entity.getDimension() == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, entity.getDimension());
        }
        statement.bindLong(3, entity.getId());
        if (entity.getName() == null) {
          statement.bindNull(4);
        } else {
          statement.bindText(4, entity.getName());
        }
        final String _tmp = __stringListConverter.fromStringList(entity.getResidents());
        if (_tmp == null) {
          statement.bindNull(5);
        } else {
          statement.bindText(5, _tmp);
        }
        if (entity.getType() == null) {
          statement.bindNull(6);
        } else {
          statement.bindText(6, entity.getType());
        }
        if (entity.getUrl() == null) {
          statement.bindNull(7);
        } else {
          statement.bindText(7, entity.getUrl());
        }
      }
    };
  }

  @Override
  public Object saveLocation(final List<Location> locations,
      final Continuation<? super Unit> $completion) {
    if (locations == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfLocation.insert(_connection, locations);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object getAllLocations(final Continuation<? super List<Location>> $completion) {
    final String _sql = "SELECT * FROM locations";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfCreated = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "created");
        final int _columnIndexOfDimension = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "dimension");
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "name");
        final int _columnIndexOfResidents = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "residents");
        final int _columnIndexOfType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "type");
        final int _columnIndexOfUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "url");
        final List<Location> _result = new ArrayList<Location>();
        while (_stmt.step()) {
          final Location _item;
          final String _tmpCreated;
          if (_stmt.isNull(_columnIndexOfCreated)) {
            _tmpCreated = null;
          } else {
            _tmpCreated = _stmt.getText(_columnIndexOfCreated);
          }
          final String _tmpDimension;
          if (_stmt.isNull(_columnIndexOfDimension)) {
            _tmpDimension = null;
          } else {
            _tmpDimension = _stmt.getText(_columnIndexOfDimension);
          }
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpName;
          if (_stmt.isNull(_columnIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _stmt.getText(_columnIndexOfName);
          }
          final List<String> _tmpResidents;
          final String _tmp;
          if (_stmt.isNull(_columnIndexOfResidents)) {
            _tmp = null;
          } else {
            _tmp = _stmt.getText(_columnIndexOfResidents);
          }
          _tmpResidents = __stringListConverter.toStringList(_tmp);
          final String _tmpType;
          if (_stmt.isNull(_columnIndexOfType)) {
            _tmpType = null;
          } else {
            _tmpType = _stmt.getText(_columnIndexOfType);
          }
          final String _tmpUrl;
          if (_stmt.isNull(_columnIndexOfUrl)) {
            _tmpUrl = null;
          } else {
            _tmpUrl = _stmt.getText(_columnIndexOfUrl);
          }
          _item = new Location(_tmpCreated,_tmpDimension,_tmpId,_tmpName,_tmpResidents,_tmpType,_tmpUrl);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @Override
  public Object getLocationByid(final int id, final Continuation<? super Location> $completion) {
    final String _sql = "SELECT * FROM locations WHERE id == ? LIMIT 1";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        final int _columnIndexOfCreated = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "created");
        final int _columnIndexOfDimension = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "dimension");
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "name");
        final int _columnIndexOfResidents = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "residents");
        final int _columnIndexOfType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "type");
        final int _columnIndexOfUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "url");
        final Location _result;
        if (_stmt.step()) {
          final String _tmpCreated;
          if (_stmt.isNull(_columnIndexOfCreated)) {
            _tmpCreated = null;
          } else {
            _tmpCreated = _stmt.getText(_columnIndexOfCreated);
          }
          final String _tmpDimension;
          if (_stmt.isNull(_columnIndexOfDimension)) {
            _tmpDimension = null;
          } else {
            _tmpDimension = _stmt.getText(_columnIndexOfDimension);
          }
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpName;
          if (_stmt.isNull(_columnIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _stmt.getText(_columnIndexOfName);
          }
          final List<String> _tmpResidents;
          final String _tmp;
          if (_stmt.isNull(_columnIndexOfResidents)) {
            _tmp = null;
          } else {
            _tmp = _stmt.getText(_columnIndexOfResidents);
          }
          _tmpResidents = __stringListConverter.toStringList(_tmp);
          final String _tmpType;
          if (_stmt.isNull(_columnIndexOfType)) {
            _tmpType = null;
          } else {
            _tmpType = _stmt.getText(_columnIndexOfType);
          }
          final String _tmpUrl;
          if (_stmt.isNull(_columnIndexOfUrl)) {
            _tmpUrl = null;
          } else {
            _tmpUrl = _stmt.getText(_columnIndexOfUrl);
          }
          _result = new Location(_tmpCreated,_tmpDimension,_tmpId,_tmpName,_tmpResidents,_tmpType,_tmpUrl);
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    }, $completion);
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
