/**
 * This class is generated by jOOQ
 */
package generated.tables


import generated.Keys
import generated.Public
import generated.tables.records.TwitterUserRecord

import java.lang.Class
import java.lang.Long
import java.lang.String
import java.sql.Timestamp
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import org.jooq.Field
import org.jooq.Identity
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.impl.TableImpl


object TwitterUser {

	/**
	 * The reference instance of <code>public.twitter_user</code>
	 */
	val TWITTER_USER = new TwitterUser
}

/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = Array(
		"http://www.jooq.org",
		"jOOQ version:3.7.0"
	),
	comments = "This class is generated by jOOQ"
)
class TwitterUser(alias : String, aliased : Table[TwitterUserRecord], parameters : Array[ Field[_] ]) extends TableImpl[TwitterUserRecord](alias, Public.PUBLIC, aliased, parameters, "") {

	/**
	 * The class holding records for this type
	 */
	override def getRecordType : Class[TwitterUserRecord] = {
		classOf[TwitterUserRecord]
	}

	/**
	 * The column <code>public.twitter_user.id</code>.
	 */
	val ID : TableField[TwitterUserRecord, Long] = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), "")

	/**
	 * The column <code>public.twitter_user.created_on</code>.
	 */
	val CREATED_ON : TableField[TwitterUserRecord, Timestamp] = createField("created_on", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), "")

	/**
	 * The column <code>public.twitter_user.phone_number</code>.
	 */
	val PHONE_NUMBER : TableField[TwitterUserRecord, String] = createField("phone_number", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), "")

	/**
	 * The column <code>public.twitter_user.twitter_user_name</code>.
	 */
	val TWITTER_USER_NAME : TableField[TwitterUserRecord, String] = createField("twitter_user_name", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), "")

	/**
	 * Create a <code>public.twitter_user</code> table reference
	 */
	def this() = {
		this("twitter_user", null, null)
	}

	/**
	 * Create an aliased <code>public.twitter_user</code> table reference
	 */
	def this(alias : String) = {
		this(alias, generated.tables.TwitterUser.TWITTER_USER, null)
	}

	private def this(alias : String, aliased : Table[TwitterUserRecord]) = {
		this(alias, aliased, null)
	}

	override def getIdentity : Identity[TwitterUserRecord, Long] = {
		Keys.IDENTITY_TWITTER_USER
	}

	override def getPrimaryKey : UniqueKey[TwitterUserRecord] = {
		Keys.TWITTER_USER_PKEY
	}

	override def getKeys : List[ UniqueKey[TwitterUserRecord] ] = {
		return Arrays.asList[ UniqueKey[TwitterUserRecord] ](Keys.TWITTER_USER_PKEY)
	}

	override def as(alias : String) : TwitterUser = {
		new TwitterUser(alias, this)
	}

	/**
	 * Rename this table
	 */
	def rename(name : String) : TwitterUser = {
		new TwitterUser(name, null)
	}
}
