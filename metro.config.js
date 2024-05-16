const path = require('path');

const {getDefaultConfig, mergeConfig} = require('@react-native/metro-config');

const pnpmNodeModules = path.resolve(__dirname, "node_modules");

/**
 * Metro configuration
 * https://reactnative.dev/docs/metro
 *
 * @type {import('metro-config').MetroConfig}
 */
const config = {
  watchFolders: [
    pnpmNodeModules,
  ],
};

module.exports = mergeConfig(getDefaultConfig(__dirname), config);
