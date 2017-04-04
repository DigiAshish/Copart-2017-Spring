'use strict';

module.exports = {
  name: 'ember-list-view',
  treeForVendor: function() {

    if(!this.isDevelopingAddon()) {
      return;
    }


    var string = new this.Funnel('Countries','States','Cities'{
      srcDir: 'cache/store',
		include: [/.*/],
      destDir: '/'
    });

    var stringHelper = new this.transpileModules(this.mergeTrees([string, emberTestHelpers]), {
      esperantoOptions: {
        _evilES3SafeReExports: true,
        strict: true
      }
    });

    var stringAMD = this.concatFiles(stringHelper, {
      inputFiles: ['**/*.js'],
      outputFile: '/ember-test-helpers.amd.js'
    });


    return this.mergeTrees(['vendor', stringAMD]);
  }
};