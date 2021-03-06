/*
 * Copyright (c) 2012. Faceture Inc.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.faceture.google.play.domain;

/**
 * Represents the JSON for a search request
 */
public class SearchRequest {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SearchRequest that = (SearchRequest) o;

        if (q != null ? !q.equals(that.q) : that.q != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return q != null ? q.hashCode() : 0;
    }

    private String q;

    public SearchRequest(String q) {
        if (null == q || q.isEmpty()) {
            throw new IllegalArgumentException("q is null or empty");
        }
        this.q = q;
    }

    public String getQ() {
        return q;
    }

}
