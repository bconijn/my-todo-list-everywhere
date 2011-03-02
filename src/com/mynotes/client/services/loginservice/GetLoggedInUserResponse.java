/*******************************************************************************
 *
 * My todo list everywhere
 *
 * Copyright (C) 2011 Davy Leggieri
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * Tou can try the demo at http://todo-list-everywhere.appspot.com
 *
 ******************************************************************************/



package com.mynotes.client.services.loginservice;

//~--- non-JDK imports --------------------------------------------------------

import com.mynotes.client.rpc.Response;
import com.mynotes.shared.UserAccountDTO;

public class GetLoggedInUserResponse implements Response {
    private UserAccountDTO user;

    // Require by GWT
    public GetLoggedInUserResponse() {}

    public GetLoggedInUserResponse(UserAccountDTO user) {
        this.user = user;
    }

    public UserAccountDTO getUserAccountDTO() {
        return this.user;
    }
}