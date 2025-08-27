package com.example.rickandmortyfinder.db;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import com.example.rickandmortyfinder.model.Converter;
import com.example.rickandmortyfinder.model.Preference;
import java.lang.Class;
import java.lang.Integer;
import java.lang.NullPointerException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.List;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class PreferenceDao_Impl implements PreferenceDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<Preference> __insertAdapterOfPreference;

  private final Converter __converter = new Converter();

  private final EntityDeleteOrUpdateAdapter<Preference> __deleteAdapterOfPreference;

  private final EntityDeleteOrUpdateAdapter<Preference> __updateAdapterOfPreference;

  public PreferenceDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfPreference = new EntityInsertAdapter<Preference>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `preference` (`id`,`showOnBoarding`,`charactersDeleted`) VALUES (?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final Preference entity) {
        statement.bindLong(1, entity.getId());
        final int _tmp = entity.getShowOnBoarding() ? 1 : 0;
        statement.bindLong(2, _tmp);
        final String _tmp_1 = __converter.fromList(entity.getCharactersDeleted());
        if (_tmp_1 == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, _tmp_1);
        }
      }
    };
    this.__deleteAdapterOfPreference = new EntityDeleteOrUpdateAdapter<Preference>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `preference` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final Preference entity) {
        statement.bindLong(1, entity.getId());
      }
    };
    this.__updateAdapterOfPreference = new EntityDeleteOrUpdateAdapter<Preference>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `preference` SET `id` = ?,`showOnBoarding` = ?,`charactersDeleted` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final Preference entity) {
        statement.bindLong(1, entity.getId());
        final int _tmp = entity.getShowOnBoarding() ? 1 : 0;
        statement.bindLong(2, _tmp);
        final String _tmp_1 = __converter.fromList(entity.getCharactersDeleted());
        if (_tmp_1 == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, _tmp_1);
        }
        statement.bindLong(4, entity.getId());
      }
    };
  }

  @Override
  public Object insertPreference(final Preference preference,
      final Continuation<? super Unit> $completion) {
    if (preference == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfPreference.insert(_connection, preference);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object deletePreference(final Preference preference,
      final Continuation<? super Unit> $completion) {
    if (preference == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __deleteAdapterOfPreference.handle(_connection, preference);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object updatePreference(final Preference preference,
      final Continuation<? super Unit> $completion) {
    if (preference == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __updateAdapterOfPreference.handle(_connection, preference);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object getPreference(final int id, final Continuation<? super Preference> $completion) {
    final String _sql = "SELECT * FROM preference WHERE id = ?";
    return DBUtil.performSuspending(__db, true, false, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfShowOnBoarding = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "showOnBoarding");
        final int _columnIndexOfCharactersDeleted = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "charactersDeleted");
        final Preference _result;
        if (_stmt.step()) {
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final boolean _tmpShowOnBoarding;
          final int _tmp;
          _tmp = (int) (_stmt.getLong(_columnIndexOfShowOnBoarding));
          _tmpShowOnBoarding = _tmp != 0;
          final List<Integer> _tmpCharactersDeleted;
          final String _tmp_1;
          if (_stmt.isNull(_columnIndexOfCharactersDeleted)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _stmt.getText(_columnIndexOfCharactersDeleted);
          }
          _tmpCharactersDeleted = __converter.toList(_tmp_1);
          _result = new Preference(_tmpId,_tmpShowOnBoarding,_tmpCharactersDeleted);
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
