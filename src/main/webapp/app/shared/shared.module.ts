import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { InventoryGatewaySharedLibsModule, InventoryGatewaySharedCommonModule, HasAnyAuthorityDirective } from './';

@NgModule({
  imports: [InventoryGatewaySharedLibsModule, InventoryGatewaySharedCommonModule],
  declarations: [HasAnyAuthorityDirective],
  exports: [InventoryGatewaySharedCommonModule, HasAnyAuthorityDirective],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class InventoryGatewaySharedModule {
  static forRoot() {
    return {
      ngModule: InventoryGatewaySharedModule
    };
  }
}
