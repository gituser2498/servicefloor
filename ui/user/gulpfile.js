var gulp = require('gulp');
var debug = require('gulp-debug');
var browserify = require('browserify');
var source = require('vinyl-source-stream');
var reactify = require('reactify');
var del = require("del");


gulp.task('clean', function(done) {
	del(['target'], done);
});

gulp.task('js', ['clean'], function() {
	browserify('./src/js/app.js').transform(reactify).bundle().pipe(source('client.js')).pipe(gulp.dest('./target/js'));
});

gulp.task('copy', ['js'], function() {	
	gulp.src('./src/index.html').pipe(gulp.dest('./target'));
	gulp.src(['./src/thirdparty/**/*']).pipe(gulp.dest('./target/thirdparty'));
	gulp.src(['./src/img/**/*']).pipe(gulp.dest('./target/img'));
});

gulp.task('default', ['copy']);

gulp.task('watch', function() {
	gulp.watch('./src/**/*.*', ['default']);
});

gulp.on('err', function(err) {
	console.log(err);
});