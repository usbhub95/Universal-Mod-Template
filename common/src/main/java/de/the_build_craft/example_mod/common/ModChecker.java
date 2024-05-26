/*
 *    This file is part of the Universal Mod Template
 *    licensed under the GNU GPL v3 License.
 *    (some parts of this file are originally from the Distant Horizons mod by James Seibel)
 *
 *    Copyright (C) 2024  Leander Knüttel
 *
 *    This program is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 3 of the License, or
 *    (at your option) any later version.
 *
 *    This program is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 *
 *    You should have received a copy of the GNU General Public License
 *    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package de.the_build_craft.example_mod.common;

import java.io.File;

/**
 * Checks if a mod is loaded
 *
 * @author coolGi
 * @author Leander Knüttel
 * @version 27.05.2024
 */
public abstract class ModChecker
{
	public static ModChecker INSTANCE;

	public ModChecker() {
		INSTANCE = this;
	}

	/**
	 * Checks if a mod is loaded
	 */
	public abstract boolean isModLoaded(String modid);

	public abstract File modLocation(String modid);

	public boolean classExists(String className) {
		try {
			Class<?> ClassTest = Class.forName(className);
			return true;
		} catch (ClassNotFoundException ignored) {
			return false;
		}
	}
}
