// entry=0x15464c

void H15464c(undefined8 *param_1)

{
  undefined **ppuVar1;
  int iVar2;
  uint uVar3;
  byte bVar4;
  uint uVar5;
  char cVar6;
  bool bVar7;
  long in_x4;
  uint in_w13;
  int *in_x14;
  long in_x16;
  undefined4 *in_x17;
  long unaff_x19;
  long unaff_x22;
  
  iVar2 = 0;
  if (*(byte *)(unaff_x19 + 0x30a) != 0) {
    iVar2 = (in_w13 - (int)*(undefined8 *)(unaff_x22 + 0x260)) + 1;
  }
  iVar2 = DAT_002862a4 - iVar2;
  bVar7 = DAT_002862a4 == 1;
  DAT_002862a4 = iVar2;
  if ((bVar7 & (*(byte *)(unaff_x19 + 0x30a) ^ bVar7 ^ 0xff)) != 0) {
    *param_1 = 0;
    param_1[1] = 0;
    *(undefined8 *)((long)param_1 + 0xf) = 0;
  }
  *in_x17 = 0;
  iVar2 = *in_x14;
  do {
    if (iVar2 == 0) {
      cVar6 = '\x01';
      bVar7 = (bool)ExclusiveMonitorPass(in_x14,0x10);
      if (bVar7) {
        *in_x14 = 1;
        cVar6 = ExclusiveMonitorsStatus();
      }
      if (cVar6 == '\0') {
        bVar4 = *(byte *)(unaff_x19 + 0x30b);
        uVar3 = *(uint *)(in_x16 + 0x614);
        iVar2 = 0;
        if (bVar4 != 0) {
          iVar2 = (in_w13 - (int)*(undefined8 *)(unaff_x22 + 0x260)) + 1;
        }
        *(uint *)(in_x16 + 0x614) = (uVar3 | -iVar2) * 2 - (uVar3 ^ -iVar2);
        uVar5 = -(int)*(undefined8 *)(unaff_x22 + 0x260);
        ppuVar1 = &PTR_LAB_00275868;
        if ((uVar3 == 1 & (bVar4 ^ uVar3 == 1 ^ 0xff)) == 0) {
          ppuVar1 = (undefined **)
                    (in_x4 + (long)(int)((in_w13 | uVar5) * 2 - (in_w13 ^ uVar5)) * 0x388 + 0x110);
        }
                    /* WARNING: Could not recover jumptable at 0x00254798. Too many branches */
                    /* WARNING: Treating indirect jump as call */
        (*(code *)*ppuVar1)();
        return;
      }
    }
    else {
      ClearExclusiveLocal();
    }
    iVar2 = *in_x14;
  } while( true );
}


