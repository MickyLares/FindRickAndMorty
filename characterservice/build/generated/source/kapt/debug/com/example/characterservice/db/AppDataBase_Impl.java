package com.example.characterservice.db;

import androidx.annotation.NonNull;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenDelegate;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class AppDataBase_Impl extends AppDataBase {
  private volatile CharacterDao _characterDao;

  @Override
  @NonNull
  protected RoomOpenDelegate createOpenDelegate() {
    final RoomOpenDelegate _openDelegate = new RoomOpenDelegate(1, "6b0f0102e46993e6a534d594cb3cf12b", "e24775c811e20df2c106ad188e4ae8d6") {
      @Override
      public void createAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS `characters` (`created` TEXT NOT NULL, `episode` TEXT NOT NULL, `gender` TEXT NOT NULL, `id` INTEGER NOT NULL, `image` TEXT NOT NULL, `location` TEXT NOT NULL, `name` TEXT NOT NULL, `origin` TEXT NOT NULL, `species` TEXT NOT NULL, `status` TEXT NOT NULL, `type` TEXT NOT NULL, `url` TEXT NOT NULL, PRIMARY KEY(`id`))");
        SQLite.execSQL(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        SQLite.execSQL(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6b0f0102e46993e6a534d594cb3cf12b')");
      }

      @Override
      public void dropAllTables(@NonNull final SQLiteConnection connection) {
        SQLite.execSQL(connection, "DROP TABLE IF EXISTS `characters`");
      }

      @Override
      public void onCreate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      public void onOpen(@NonNull final SQLiteConnection connection) {
        internalInitInvalidationTracker(connection);
      }

      @Override
      public void onPreMigrate(@NonNull final SQLiteConnection connection) {
        DBUtil.dropFtsSyncTriggers(connection);
      }

      @Override
      public void onPostMigrate(@NonNull final SQLiteConnection connection) {
      }

      @Override
      @NonNull
      public RoomOpenDelegate.ValidationResult onValidateSchema(
          @NonNull final SQLiteConnection connection) {
        final Map<String, TableInfo.Column> _columnsCharacters = new HashMap<String, TableInfo.Column>(12);
        _columnsCharacters.put("created", new TableInfo.Column("created", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacters.put("episode", new TableInfo.Column("episode", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacters.put("gender", new TableInfo.Column("gender", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacters.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacters.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacters.put("location", new TableInfo.Column("location", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacters.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacters.put("origin", new TableInfo.Column("origin", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacters.put("species", new TableInfo.Column("species", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacters.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacters.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacters.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final Set<TableInfo.ForeignKey> _foreignKeysCharacters = new HashSet<TableInfo.ForeignKey>(0);
        final Set<TableInfo.Index> _indicesCharacters = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCharacters = new TableInfo("characters", _columnsCharacters, _foreignKeysCharacters, _indicesCharacters);
        final TableInfo _existingCharacters = TableInfo.read(connection, "characters");
        if (!_infoCharacters.equals(_existingCharacters)) {
          return new RoomOpenDelegate.ValidationResult(false, "characters(com.example.characterservice.data.model.Character).\n"
                  + " Expected:\n" + _infoCharacters + "\n"
                  + " Found:\n" + _existingCharacters);
        }
        return new RoomOpenDelegate.ValidationResult(true, null);
      }
    };
    return _openDelegate;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final Map<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final Map<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "characters");
  }

  @Override
  public void clearAllTables() {
    super.performClear(false, "characters");
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final Map<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CharacterDao.class, CharacterDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final Set<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public CharacterDao characterDao() {
    if (_characterDao != null) {
      return _characterDao;
    } else {
      synchronized(this) {
        if(_characterDao == null) {
          _characterDao = new CharacterDao_Impl(this);
        }
        return _characterDao;
      }
    }
  }
}
