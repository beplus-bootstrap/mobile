#import "AppDelegate.h"

#import <React/RCTBundleURLProvider.h>

#import "RNCConfig.h"

@implementation AppDelegate

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions
{
  self.moduleName = @"beplus";
  // You can add your custom initial props in the dictionary below.
  // They will be passed down to the ViewController used by React Native.
  self.initialProps = @{};

  // NSString *varInObjC = [RNCConfig envFor:@"BE_VAR_IN_OBJC"];
  // NSLog(@"RNConfig_ObjC: %@", varInObjC);

  // NSString *varInPlist = [mainBundle objectForInfoDictionaryKey:@"VarInPlist"];
  // NSLog(@"RNConfig_Plist: %@", varInPlist);

  NSBundle* mainBundle = [NSBundle mainBundle]; 

  return [super application:application didFinishLaunchingWithOptions:launchOptions];
}

- (NSURL *)sourceURLForBridge:(RCTBridge *)bridge
{
  return [self bundleURL];
}

- (NSURL *)bundleURL
{
#if DEBUG
  return [[RCTBundleURLProvider sharedSettings] jsBundleURLForBundleRoot:@"index"];
#else
  return [[NSBundle mainBundle] URLForResource:@"main" withExtension:@"jsbundle"];
#endif
}

@end
