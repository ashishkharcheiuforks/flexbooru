/*
 * Copyright (C) 2019. by onlymash <im@fiepi.me>, All rights reserved
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 */

package onlymash.flexbooru.entity.artist

import com.google.gson.annotations.SerializedName

data class ArtistMoe(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("alias_id")
    val aliasId: Int?,
    @SerializedName("group_id")
    val groupId: Int?,
    @SerializedName("urls")
    val urls: MutableList<String>?
) : ArtistBase() {
    override fun getArtistId(): Int = id
    override fun getArtistName(): String  = name
    override fun getArtistUrls(): MutableList<String> = urls ?: mutableListOf()
}