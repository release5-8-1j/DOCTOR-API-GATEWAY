import { NgModule } from '@angular/core';

import { DoctorgatewaySharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [DoctorgatewaySharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [DoctorgatewaySharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class DoctorgatewaySharedCommonModule {}
