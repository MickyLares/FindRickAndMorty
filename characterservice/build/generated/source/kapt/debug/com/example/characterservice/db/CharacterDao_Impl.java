package com.example.characterservice.db;

import androidx.annotation.NonNull;
import androidx.room.EntityDeleteOrUpdateAdapter;
import androidx.room.EntityInsertAdapter;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.sqlite.SQLiteStatement;
import com.example.characterservice.data.model.Character;
import com.example.characterservice.data.model.Location;
import com.example.characterservice.data.model.Origin;
import com.example.characterservice.utils.LocationConverter;
import com.example.characterservice.utils.OriginConverter;
import com.example.characterservice.utils.StringListConverter;
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
import kotlinx.coroutines.flow.Flow;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation", "removal"})
public final class CharacterDao_Impl implements CharacterDao {
  private final RoomDatabase __db;

  private final EntityInsertAdapter<Character> __insertAdapterOfCharacter;

  private final StringListConverter __stringListConverter = new StringListConverter();

  private final LocationConverter __locationConverter = new LocationConverter();

  private final OriginConverter __originConverter = new OriginConverter();

  private final EntityDeleteOrUpdateAdapter<Character> __updateAdapterOfCharacter;

  public CharacterDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertAdapterOfCharacter = new EntityInsertAdapter<Character>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR REPLACE INTO `characters` (`created`,`episode`,`gender`,`id`,`image`,`location`,`name`,`origin`,`species`,`status`,`type`,`url`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final Character entity) {
        if (entity.getCreated() == null) {
          statement.bindNull(1);
        } else {
          statement.bindText(1, entity.getCreated());
        }
        final String _tmp = __stringListConverter.fromStringList(entity.getEpisode());
        if (_tmp == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, _tmp);
        }
        if (entity.getGender() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getGender());
        }
        statement.bindLong(4, entity.getId());
        if (entity.getImage() == null) {
          statement.bindNull(5);
        } else {
          statement.bindText(5, entity.getImage());
        }
        final String _tmp_1 = __locationConverter.fromLocation(entity.getLocation());
        if (_tmp_1 == null) {
          statement.bindNull(6);
        } else {
          statement.bindText(6, _tmp_1);
        }
        if (entity.getName() == null) {
          statement.bindNull(7);
        } else {
          statement.bindText(7, entity.getName());
        }
        final String _tmp_2 = __originConverter.fromOrigin(entity.getOrigin());
        if (_tmp_2 == null) {
          statement.bindNull(8);
        } else {
          statement.bindText(8, _tmp_2);
        }
        if (entity.getSpecies() == null) {
          statement.bindNull(9);
        } else {
          statement.bindText(9, entity.getSpecies());
        }
        if (entity.getStatus() == null) {
          statement.bindNull(10);
        } else {
          statement.bindText(10, entity.getStatus());
        }
        if (entity.getType() == null) {
          statement.bindNull(11);
        } else {
          statement.bindText(11, entity.getType());
        }
        if (entity.getUrl() == null) {
          statement.bindNull(12);
        } else {
          statement.bindText(12, entity.getUrl());
        }
      }
    };
    this.__updateAdapterOfCharacter = new EntityDeleteOrUpdateAdapter<Character>() {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `characters` SET `created` = ?,`episode` = ?,`gender` = ?,`id` = ?,`image` = ?,`location` = ?,`name` = ?,`origin` = ?,`species` = ?,`status` = ?,`type` = ?,`url` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SQLiteStatement statement,
          @NonNull final Character entity) {
        if (entity.getCreated() == null) {
          statement.bindNull(1);
        } else {
          statement.bindText(1, entity.getCreated());
        }
        final String _tmp = __stringListConverter.fromStringList(entity.getEpisode());
        if (_tmp == null) {
          statement.bindNull(2);
        } else {
          statement.bindText(2, _tmp);
        }
        if (entity.getGender() == null) {
          statement.bindNull(3);
        } else {
          statement.bindText(3, entity.getGender());
        }
        statement.bindLong(4, entity.getId());
        if (entity.getImage() == null) {
          statement.bindNull(5);
        } else {
          statement.bindText(5, entity.getImage());
        }
        final String _tmp_1 = __locationConverter.fromLocation(entity.getLocation());
        if (_tmp_1 == null) {
          statement.bindNull(6);
        } else {
          statement.bindText(6, _tmp_1);
        }
        if (entity.getName() == null) {
          statement.bindNull(7);
        } else {
          statement.bindText(7, entity.getName());
        }
        final String _tmp_2 = __originConverter.fromOrigin(entity.getOrigin());
        if (_tmp_2 == null) {
          statement.bindNull(8);
        } else {
          statement.bindText(8, _tmp_2);
        }
        if (entity.getSpecies() == null) {
          statement.bindNull(9);
        } else {
          statement.bindText(9, entity.getSpecies());
        }
        if (entity.getStatus() == null) {
          statement.bindNull(10);
        } else {
          statement.bindText(10, entity.getStatus());
        }
        if (entity.getType() == null) {
          statement.bindNull(11);
        } else {
          statement.bindText(11, entity.getType());
        }
        if (entity.getUrl() == null) {
          statement.bindNull(12);
        } else {
          statement.bindText(12, entity.getUrl());
        }
        statement.bindLong(13, entity.getId());
      }
    };
  }

  @Override
  public Object saveCharacters(final List<Character> characters,
      final Continuation<? super Unit> $completion) {
    if (characters == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __insertAdapterOfCharacter.insert(_connection, characters);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Object updateCharacter(final Character character,
      final Continuation<? super Unit> $completion) {
    if (character == null) throw new NullPointerException();
    return DBUtil.performSuspending(__db, false, true, (_connection) -> {
      __updateAdapterOfCharacter.handle(_connection, character);
      return Unit.INSTANCE;
    }, $completion);
  }

  @Override
  public Flow<List<Character>> getAllCharacters() {
    final String _sql = "SELECT * FROM characters";
    return FlowUtil.createFlow(__db, false, new String[] {"characters"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        final int _columnIndexOfCreated = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "created");
        final int _columnIndexOfEpisode = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "episode");
        final int _columnIndexOfGender = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "gender");
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfImage = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "image");
        final int _columnIndexOfLocation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "location");
        final int _columnIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "name");
        final int _columnIndexOfOrigin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "origin");
        final int _columnIndexOfSpecies = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "species");
        final int _columnIndexOfStatus = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "status");
        final int _columnIndexOfType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "type");
        final int _columnIndexOfUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "url");
        final List<Character> _result = new ArrayList<Character>();
        while (_stmt.step()) {
          final Character _item;
          final String _tmpCreated;
          if (_stmt.isNull(_columnIndexOfCreated)) {
            _tmpCreated = null;
          } else {
            _tmpCreated = _stmt.getText(_columnIndexOfCreated);
          }
          final List<String> _tmpEpisode;
          final String _tmp;
          if (_stmt.isNull(_columnIndexOfEpisode)) {
            _tmp = null;
          } else {
            _tmp = _stmt.getText(_columnIndexOfEpisode);
          }
          _tmpEpisode = __stringListConverter.toStringList(_tmp);
          final String _tmpGender;
          if (_stmt.isNull(_columnIndexOfGender)) {
            _tmpGender = null;
          } else {
            _tmpGender = _stmt.getText(_columnIndexOfGender);
          }
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpImage;
          if (_stmt.isNull(_columnIndexOfImage)) {
            _tmpImage = null;
          } else {
            _tmpImage = _stmt.getText(_columnIndexOfImage);
          }
          final Location _tmpLocation;
          final String _tmp_1;
          if (_stmt.isNull(_columnIndexOfLocation)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _stmt.getText(_columnIndexOfLocation);
          }
          _tmpLocation = __locationConverter.toLocation(_tmp_1);
          final String _tmpName;
          if (_stmt.isNull(_columnIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _stmt.getText(_columnIndexOfName);
          }
          final Origin _tmpOrigin;
          final String _tmp_2;
          if (_stmt.isNull(_columnIndexOfOrigin)) {
            _tmp_2 = null;
          } else {
            _tmp_2 = _stmt.getText(_columnIndexOfOrigin);
          }
          _tmpOrigin = __originConverter.toOrigin(_tmp_2);
          final String _tmpSpecies;
          if (_stmt.isNull(_columnIndexOfSpecies)) {
            _tmpSpecies = null;
          } else {
            _tmpSpecies = _stmt.getText(_columnIndexOfSpecies);
          }
          final String _tmpStatus;
          if (_stmt.isNull(_columnIndexOfStatus)) {
            _tmpStatus = null;
          } else {
            _tmpStatus = _stmt.getText(_columnIndexOfStatus);
          }
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
          _item = new Character(_tmpCreated,_tmpEpisode,_tmpGender,_tmpId,_tmpImage,_tmpLocation,_tmpName,_tmpOrigin,_tmpSpecies,_tmpStatus,_tmpType,_tmpUrl);
          _result.add(_item);
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @Override
  public Flow<Character> getCharacterById(final int id) {
    final String _sql = "SELECT * FROM characters WHERE id == ? LIMIT 1";
    return FlowUtil.createFlow(__db, false, new String[] {"characters"}, (_connection) -> {
      final SQLiteStatement _stmt = _connection.prepare(_sql);
      try {
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, id);
        final int _columnIndexOfCreated = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "created");
        final int _columnIndexOfEpisode = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "episode");
        final int _columnIndexOfGender = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "gender");
        final int _columnIndexOfId = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "id");
        final int _columnIndexOfImage = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "image");
        final int _columnIndexOfLocation = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "location");
        final int _columnIndexOfName = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "name");
        final int _columnIndexOfOrigin = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "origin");
        final int _columnIndexOfSpecies = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "species");
        final int _columnIndexOfStatus = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "status");
        final int _columnIndexOfType = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "type");
        final int _columnIndexOfUrl = SQLiteStatementUtil.getColumnIndexOrThrow(_stmt, "url");
        final Character _result;
        if (_stmt.step()) {
          final String _tmpCreated;
          if (_stmt.isNull(_columnIndexOfCreated)) {
            _tmpCreated = null;
          } else {
            _tmpCreated = _stmt.getText(_columnIndexOfCreated);
          }
          final List<String> _tmpEpisode;
          final String _tmp;
          if (_stmt.isNull(_columnIndexOfEpisode)) {
            _tmp = null;
          } else {
            _tmp = _stmt.getText(_columnIndexOfEpisode);
          }
          _tmpEpisode = __stringListConverter.toStringList(_tmp);
          final String _tmpGender;
          if (_stmt.isNull(_columnIndexOfGender)) {
            _tmpGender = null;
          } else {
            _tmpGender = _stmt.getText(_columnIndexOfGender);
          }
          final int _tmpId;
          _tmpId = (int) (_stmt.getLong(_columnIndexOfId));
          final String _tmpImage;
          if (_stmt.isNull(_columnIndexOfImage)) {
            _tmpImage = null;
          } else {
            _tmpImage = _stmt.getText(_columnIndexOfImage);
          }
          final Location _tmpLocation;
          final String _tmp_1;
          if (_stmt.isNull(_columnIndexOfLocation)) {
            _tmp_1 = null;
          } else {
            _tmp_1 = _stmt.getText(_columnIndexOfLocation);
          }
          _tmpLocation = __locationConverter.toLocation(_tmp_1);
          final String _tmpName;
          if (_stmt.isNull(_columnIndexOfName)) {
            _tmpName = null;
          } else {
            _tmpName = _stmt.getText(_columnIndexOfName);
          }
          final Origin _tmpOrigin;
          final String _tmp_2;
          if (_stmt.isNull(_columnIndexOfOrigin)) {
            _tmp_2 = null;
          } else {
            _tmp_2 = _stmt.getText(_columnIndexOfOrigin);
          }
          _tmpOrigin = __originConverter.toOrigin(_tmp_2);
          final String _tmpSpecies;
          if (_stmt.isNull(_columnIndexOfSpecies)) {
            _tmpSpecies = null;
          } else {
            _tmpSpecies = _stmt.getText(_columnIndexOfSpecies);
          }
          final String _tmpStatus;
          if (_stmt.isNull(_columnIndexOfStatus)) {
            _tmpStatus = null;
          } else {
            _tmpStatus = _stmt.getText(_columnIndexOfStatus);
          }
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
          _result = new Character(_tmpCreated,_tmpEpisode,_tmpGender,_tmpId,_tmpImage,_tmpLocation,_tmpName,_tmpOrigin,_tmpSpecies,_tmpStatus,_tmpType,_tmpUrl);
        } else {
          _result = null;
        }
        return _result;
      } finally {
        _stmt.close();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
