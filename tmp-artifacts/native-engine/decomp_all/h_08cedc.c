// entry=0x8cedc

void H8cedc(char param_1)

{
  undefined **ppuVar1;
  uint uVar2;
  uint uVar3;
  long lVar4;
  undefined1 *puVar5;
  int iVar6;
  long unaff_x29;
  
  iVar6 = (int)DAT_00274480;
  if (param_1 != '\0') {
    (*(code *)(&DAT_0029e620)
              [(long)(int)(-0x6b073d0f - (-iVar6 ^ 0xffffffffU)) * 0x2b +
               (long)(int)(-0x6b073d07 - (-iVar6 ^ 0xffffffffU))])
              (*(undefined8 *)(unaff_x29 + -0x130));
    uVar3 = -(int)DAT_00274480;
    puVar5 = (undefined1 *)
             (*(code *)(&PTR_FUN_0027c1e0)
                       [(long)(int)((uVar3 | 0x94f8c2f2) * 2 - (uVar3 ^ 0x94f8c2f2)) * 300 +
                        (long)(int)(-0x6b073bfa - (-(int)DAT_00274480 ^ 0xffffffffU))])(4);
    *puVar5 = 0x31;
    puVar5[1] = 0x30;
    puVar5[-0x66442ea56b073d0d - (-DAT_00274480 ^ 0xffffffffffffffffU)] = 0x37;
    puVar5[3] = 0;
    uVar3 = -(int)DAT_00274480;
    uVar2 = -(int)DAT_00274480;
    (*(code *)(&PTR_FUN_0027c1e0)
              [(long)(int)((uVar3 | 0x94f8c2f2) + (uVar3 & 0x94f8c2f2)) * 300 +
               (long)(int)((uVar2 ^ 0x94f8c393) + (uVar2 & 0x94f8c393) * 2)])
              (*(undefined8 *)(unaff_x29 + -0x130),*(undefined8 *)(unaff_x29 + -0x140),3);
    uVar3 = -(int)DAT_00274480;
    uVar2 = -(int)DAT_00274480;
    (*(code *)(&PTR_FUN_0027c1e0)
              [(long)(int)((uVar2 | 0x94f8c2f2) + (uVar2 & 0x94f8c2f2)) * 300 +
               (long)(int)((uVar3 ^ 0x94f8c342) + (uVar3 & 0x94f8c342) * 2)])(puVar5);
                    /* WARNING: Could not recover jumptable at 0x00180058. Too many branches */
                    /* WARNING: Treating indirect jump as call */
    (*(code *)PTR_LAB_00279a28)();
    return;
  }
  lVar4 = (*(code *)(&DAT_0029e620)
                    [(long)(int)(-0x6b073d0f - (-iVar6 ^ 0xffffffffU)) * 0x2b +
                     (long)(int)((-iVar6 ^ 0x94f8c300U) + (-iVar6 & 0x94f8c300U) * 2)])
                    (*(undefined8 *)(unaff_x29 + -0x130));
  ppuVar1 = &PTR_LAB_002831e0;
  if (lVar4 != 0) {
    ppuVar1 = &PTR_LAB_00275940;
  }
                    /* WARNING: Could not recover jumptable at 0x0017fe8c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)*ppuVar1)();
  return;
}


